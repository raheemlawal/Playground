public class CookieMonster{
    
    int cookieCount;
    
    public CookieMonster(int cookieCount){
        this.cookieCount = cookieCount;
    }
    public void eat(){
        cookieCount -= 1;
    }
    public void addMoreCookies(int amount){
        cookieCount += 1;
    }
    public static void main(String[]args){
        CookieMonster cm = new CookieMonster(5);
        cm.eat();
        cm.eat();
        cm.addMoreCookies(1);
        System.out.println(cm.cookieCount);
    }
}