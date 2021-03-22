public class Employee {
    private int work=0;
    private int sallary=0;
    public void compensate(int compensation){
       try{
        this.work=compensation/100;
        if (this.work==0){
            throw new UnderpaidException(100-compensation);
        }
        else if(this.work>10){
            throw new BurnoutException();
        }
        else{
            this.sallary+=compensation;
        }
       }catch(UnderpaidException|BurnoutException e){
           System.out.println(e.getMessage());
       }
        
    }
    public void work(){
       try{
           if (this.sallary==0){
               throw new UnpaidException();
           }
        }catch(UnpaidException e){
            System.out.println(e.getMessage());
        }
    }
    public void nextDay(){
       this.sallary=0;
       this.work=0;
    }
}
