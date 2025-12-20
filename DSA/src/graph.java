class gra{
    int arr[][];
    int ver;
    int value[];
    gra(int a[]){
        this.ver = a.length;
        value = new int[ver];
        this.arr =new int[ver][ver];
        for(int i = 0; i<ver; i++){
            value[i]=a[i];
        }
    }

    public void insert(int src, int dest){
          arr[src][dest]=1;
          arr[dest][src]=1;
        

    }
    public void display(){
        System.out.print(" ");
        for(int i = 0 ; i<ver; i++){
            System.out.print(value[i]+" ");
        }
        System.out.println();
        for(int i = 0; i<ver; i++){
            System.out.print(value[i]+" ");
            for(int j = 0; j < ver; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
public class graph {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        gra n = new gra(arr);
        n.insert(0,0);
        n.insert(1,1);
        n.insert(2,2);
        n.insert(3,3);
        n.insert(4,4);
        n.insert(5,5);
        n.insert(6,6);
        n.display();
    }
}
