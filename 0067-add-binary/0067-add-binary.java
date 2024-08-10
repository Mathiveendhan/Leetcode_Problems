class Solution 
{
  public String addBinary(String a, String b) 
  {
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry == 1) 
    {
      if(i >= 0)
        carry += Character.getNumericValue(a.charAt(i));
        i--;
      if(j >= 0)
        carry += Character.getNumericValue(b.charAt(j));
        j--;
      sb.append(carry % 2);
      carry /= 2;
    }
    return sb.reverse().toString();
  }
}