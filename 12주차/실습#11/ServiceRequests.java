package subject_1;

public class ServiceRequests {
    private int count;              //고객의 수
    private String[] customers = new String[5];  //고객의 명단

    public ServiceRequests(){
        this.count = 0;
    }

    public void addCustomer(String name) throws ServiceBackUpException {
        if(count >= 5){
            throw new ServiceBackUpException("예외 발생: 목록이 꽉 차서 고객의 이름을 추가할 수 없다");
        }
        customers[count] = name;
        count++;
    }

    public void deleteCustomer(String name) throws NoServiceRequestException {
        for(int i = 0; i < count; i++){
            if(customers[i].equals(name)){
                for(int j = i; j < count-1; j++){
                    customers[j] = customers[j+1];
                }
                count--;
                return;
            }
        }
        throw new NoServiceRequestException("예외 발생: 목록에 고객의 이름이 없다");
    }

    public int getCount(){
        return this.count;
    }

    public void printCustomers(){
        for(int i = 0; i < count; i++){
            System.out.println("고객 " + (i+1) + ": " + customers[i]);
        }
    }
}
