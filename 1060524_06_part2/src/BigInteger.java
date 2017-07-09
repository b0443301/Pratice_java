import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class BigInteger {
public List value;
    
    public BigInteger(String val) {
        // ���Ʀr����
        String v = val.charAt(0) == '-' ? val.substring(1) : val;
        // �C�|�Ӧr����R���@�� int
        value = new ArrayList<>();
        for(int i = v.length() - 4; i > -4; i -= 4) {
            value.add(Integer.parseInt(v.substring(i >= 0 ? i : 0, i + 4)));
        }
        // �ɦ�A��ƥH 8 �����
        int valueLength = (value.size() / 8 + 1) * 8;
        for(int i = value.size(); i < valueLength; i++) {
            value.add(0);
        }
        // �t����ɼƪ���
        value = val.charAt(0) == '-' ? toComplement(value) : value;        
    }

    private BigInteger(List<Integer> value) {
        this.value = value;
    }
    
    public BigInteger add(BigInteger that) {
        if(isNegative(that.value)) {
            return subtract(new BigInteger(toComplement(that.value)));
        }
        // ������
        int length = Math.max(value.size(), that.value.size());
        List op1 = copyOf(value, length);
        List<Integer> op2 = copyOf(that.value, length);
        List<Integer> result = new ArrayList<>();
        
        int carry = 0;
        for(int i = 0; i < length - 1; i++) {
            int c = op1.get(i) + op2.get(i) + carry;
            if(c < 10000) {
                carry = 0;
            } else {
                c -= 10000;
                carry = 1;
            }
            result.add(c);
        }
        
        if(carry == 1) { // ����B�z
            if(isPositive(op1)) { result.add(1); } 
            else { result.clear(); } // �t�ƥ[�k�B�ⷸ��N�O 0
            for(int i = 0; i < 8; i++) { result.add(0); } // �۰ʼW�[ 8 ���
        } else { // �ɦ�A���Ƹ� 0�A�t�Ƹ� 9999
            result.add(isPositive(op1) ? 0 : 9999);
        }
        return new BigInteger(result);
    }
    
    public BigInteger subtract(BigInteger that) {
        if(isNegative(that.value)) {
            return add(new BigInteger(toComplement(that.value)));
        }
        // ������
        int length = Math.max(value.size(), that.value.size());
        List<Integer> op1 = copyOf(value, length);
        List<Integer> op2 = copyOf(that.value, length);
        List<Integer> result = new ArrayList<>();
        
        int borrow = 0;
        for(int i = 0; i < length - 1; i++) { 
            int c = op1.get(i) - op2.get(i) - borrow; 
            if(c > -1) {
                borrow = 0;
            } else { // �ɦ� 
                c += 10000; 
                borrow = 1; 
            }
            result.add(c);
        }
        
        if(borrow == 1) { // ����B�z
            if(isNegative(op1)) { result.add(9998); } 
            else { result.clear(); } // ���ƴ�k�B�ⷸ��N�O 0
            for(int i = 0; i < 8; i++) { result.add(9999); } // �۰ʼW�[ 8 ���
        } else {  // �ɦ�A�t�Ƹ� 9999�A���Ƹ� 0
            result.add(isNegative(op1) ? 9999 : 0);
        }
        
        return new BigInteger(result);
    }

    // �k�B�⤸�� int �ɪ����k�B��A�����ϥΡA��ӹB�⤸���n�O����
    private BigInteger multiply(int val, int shift) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < shift; i++) { result.add(0); } // �첾�� 0
        int carry = 0;
        for(int i = 0; i < value.size() - 1; i++) {
            int tmp = value.get(i) * val + carry;
            result.add(tmp % 10000);
            carry = tmp / 10000;
        }
        if(carry != 0) {
            result.add(carry);
            for(int i = 0; i < 8; i++) { result.add(0); }
        } else { result.add(0); }

        return new BigInteger(result);
    }
    
    public BigInteger multiply(BigInteger that) {
        // �ॿ�ƪ���
        BigInteger op1 = isNegative(value) ? 
                           new BigInteger(toComplement(value)) : this;
        List<Integer> op2 = isNegative(that.value) ? 
                                      toComplement(that.value) : that.value;
        // �v��B��
        List<BigInteger> rs = new ArrayList<>();
        for(int i = 0; i < op2.size() - 1; i++) {
            rs.add(op1.multiply(op2.get(i), i));
        }
        // ��v��B�⵲�G�[�`
        BigInteger result = rs.get(0);
        for(int i = 1; i < rs.size(); i++) {
            result = result.add(rs.get(i));
        }
        // �P�_���t��
        return getLast(value) + getLast(that.value) == 9999 ? 
            new BigInteger(toComplement(result.value)) : result;
    }
    
    public boolean greaterOrEquals(BigInteger that) {
        return isNegative(subtract(that).value) ? false : true;
    }
    
    private boolean islessOrEqualsToQuotient(BigInteger op1, BigInteger op2) {
        return op1.greaterOrEquals(multiply(op2)) ? true : false;
    }
    
    // �k�B�⤸�� int �ɪ����k�B��A�����ϥΡA��ӹB�⤸���n�O����
    private BigInteger divide(int that) {
        List<Integer> result = new ArrayList<>();
        int remain = 0;
        for(int i = value.size() - 1; i > -1; i--) {
            int tmp = value.get(i) + remain;
            result.add(tmp / that);
            remain = (tmp % that) * 10000;
        }
        Collections.reverse(result);
        for(int i = 0; i < 8 - (result.size() % 8); i++) {
            result.add(0);
        }
        return new BigInteger(result);
    }

    public BigInteger divide(BigInteger that) {
        // �@�ߥ��H���ƪ���
        BigInteger op1 = isNegative(value) ? 
                             new BigInteger(toComplement(value)) : this;
        BigInteger op2 = isNegative(that.value) ? 
                             new BigInteger(toComplement(that.value)) : that;
        
        BigInteger one = new BigInteger("1");
        BigInteger left = new BigInteger("0");
        BigInteger right = op1;

        // �G���k�j�M x.islessOrEqualsToQuotient(op1, op2) �� true ���̤j x ��
        while(right.greaterOrEquals(left)) {
            BigInteger x = left.add(right).divide(2);
            if(x.islessOrEqualsToQuotient(op1, op2)) {
                left = x.add(one);
            } else {
                right = x.subtract(one);
            }
        }
        BigInteger result = left.subtract(one);

        // �P�_���t��
        return getLast(value) + getLast(that.value) == 9999 ? 
            new BigInteger(toComplement(result.value)) : result;
    }
    
    private boolean isNegative(List value2) {
		// TODO Auto-generated method stub
		return false;
	}

	private String toComplement(List value2) {
		// TODO Auto-generated method stub
		return null;
	}

	private     int getLast(List value2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
        // �@�ߥH���ƪ���
        List<Integer> v = isNegative(value) ? toComplement(value) : value;
        StringBuilder builder = new StringBuilder();
        for(int i = v.size() - 1; i > -1; i--) {
            builder.append(String.format("%04d", v.get(i)));
        }
        // ���h�e�ݪ� 0�A�t�Ƹɭt��
        while(builder.length() > 0 && builder.charAt(0) == '0') {
            builder.deleteCharAt(0);
        }
        return builder.length() == 0 ? "0" : 
                   isNegative(value) ? builder.insert(0, '-').toString() : 
                       builder.toString();
    }
        
    private static List<Integer> toComplement(List<Integer> v) {
        List<Integer> comp = new ArrayList<>();
        for(Integer i : v) { comp.add(9999 - i); }
        comp.set(0, comp.get(0) + 1);
        return comp;
    }
    
    private static List<Integer> copyOf(
                List<Integer> original, int newLength) {
        List<Integer> v = new ArrayList<>(original);
        for(int i = v.size(); i < newLength; i++) {
            v.add(isPositive(original) ? 0 : 9999);
        }
        return v;
    }
    
    private static Integer getLast(List list) {
        return list.get(list.size() - 1);
    }
    
    private static boolean isNegative(List list) {
        return getLast(list) == 9999;
    }
    
    private static boolean isPositive(List list) {
        return getLast(list) == 0;
    }
    
    private static boolean isZero(List<Integer> list) {
        for(Integer i : list) if(i != 0) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        BigInteger a = new BigInteger("9999999999999999999999999999");
        BigInteger b = new BigInteger("-2");
        System.out.println(a.add(b));       // 9999999999999999999999999997
        System.out.println(a.subtract(b));  // 10000000000000000000000000001
        System.out.println(a.multiply(b));  // -19999999999999999999999999998
        System.out.println(a.divide(b));    // -4999999999999999999999999999
    }
		    }
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}