import java.io.File;

public class Show{
	public static void main(String[] args){
		String  rootpath = "/home/fulla/Desktop/year3term1/processing/testsoft1/java/folder" ;
listFileNames(rootpath,0) ;

}
static void listFileNames(String dir,int a) {
  File file = new File(dir);
  if (file.isDirectory()) {
    String names[] = file.list();
    File fileInside[] = file.listFiles();
    if(names != null){
      for (int i = 0; i < names.length; i++){
        String namesInside[] = fileInside[i].list();
        if(namesInside != null){
        for (int x = 0 ; x <= a ; x++){System.out.print(" "); }
        System.out.print(">") ;
        System.out.println(names[i]) ;
        int b = a + 1 ;
        listFileNames(dir + "/" + names[i] ,b) ;
      }
      else{
        for (int x = 0 ; x <= a+1 ; x++){System.out.print(" "); }
        System.out.println(names[i]) ;
      }
    }
    }
  } 
}
}
