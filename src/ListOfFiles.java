import java.io.File;

public class ListOfFiles {
    public static void main(String args[])
        {
          File f=null;
          String[] path;
          f=new File("/home/user/hello/htmlfile");
          path=f.list();
            for(String paths:path) {
                // prints filename and directory name
                System.out.println(paths);
            }





    }

        }






