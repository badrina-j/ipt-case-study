public class IptCaseStudy {
    public char CharAt(String a, int b){
        return a.charAt(b);
    }
    
    public int IndexOf(String a,char b){
        return a.indexOf(b);
    }
    
    public boolean Contains(String a, String b){
        return a.contains(b);
    }

    public boolean EndsWith(String a, String b){
        return a.endsWith(b);
    }
    
    public String Concatinating(String a, String b){
        return a.concat(b);
    }
    
    public int Length(String c){
        return c.length();
    }

    public String Lowercase(String a){
        return a.toLowerCase();
    }
    
    public String Uppercase(String a){
        return a.toUpperCase();
    }
    
    public String Replace(String a, String b){
        return a.replace(a, b);
   }

   public int Compare(String a, String b){
        return a.compareTo(b);
    }
    
    public boolean Equal(String a, String b){
        return a.equals(b);
    }
 
    public boolean Check(String a){
       return a.isEmpty();
    }


}