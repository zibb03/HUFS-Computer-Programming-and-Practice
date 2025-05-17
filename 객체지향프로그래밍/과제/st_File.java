import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
public class st_File {
	static boolean Empty() {
		File file = new File("st_info");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(sc.hasNext()) {
			return false;
		}
		return true;
	}

	static void writeDatatoFile(St_info info) throws IOException {
		File file = new File("st_info");
		PrintWriter output = new PrintWriter(new FileWriter(file, true));
		output.println(info.getID());
		output.println(info.getName());
		output.println(info.getAdd());
		output.println(info.getDept());
		output.println(info.getCourse());
		output.println();
		
		output.close();
	}

	static boolean Exist_ID_File(String ID) throws FileNotFoundException {
		File file = new File("st_info");
		 Scanner input = new Scanner(file);
	        String correct_ID;
	        while (input.hasNext()) {
	            	correct_ID = input.next();
	                if (correct_ID.equals(ID)) {
	                	input.close();
	                	return true;
	                }
	             else {
	            	 for(int i = 0; i < 5; i++) {
	            		 input.nextLine();
	            	 }
	            	
	            }
	        }
	        input.close();
	       return false;
	}
	private static Scanner File_input (String ID) throws FileNotFoundException {
		File file = new File("st_info");
		 Scanner input = new Scanner(file);
	        String correct_ID;
	        while (input.hasNext()) {
	            	correct_ID = input.next();
	                if (correct_ID.equals(ID)) {
	                	break;
	                }
	             else {
	            	 for(int i = 0; i < 5; i++) {
	            		 input.nextLine();
	            	 }
	            	
	            }
	        }
	       return input;
	}
	
	static String[] Display_AllFromFile() throws FileNotFoundException {
		File file = new File("st_info");
		Scanner input = new Scanner(file);
		int count =1;
		String result[] = new String[idx()] ;
		while(input.hasNext()) {
			String ID = input.next(); 
			String name = input.next();
			String Address = input.next();
			String Department = input.next();
			String Courses = input.next();
			input.nextLine();
			result[count-1] =("Student "+ count + "\n" + "ID:"+ID + " Name:" + name + " Address:" + Address + " Department:" + Department + " \nCourses: " + Courses + " \n");
			count++;
		}
		input.close();
		return result;
	}

	private static int idx() throws FileNotFoundException {
		File file = new File("st_info");
		int count= 0;
		int result=0;
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			count++;
			input.nextLine();
		}
		input.close();
		result = (count+1)/6;
		return result;
	}
	
	static String Search_ID_File( String ID_To_Find) throws FileNotFoundException {
        String result;
        boolean flag=false;
        flag = Exist_ID_File(ID_To_Find);
        if(flag) {
        	Scanner input = File_input(ID_To_Find);
        	 String ID = ID_To_Find;
    		 String name = input.next();
    		 String Address = input.next();
    		 String Department = input.next();
    		 String course = input.next();
    		 input.nextLine();
    		 result =("\n"+ "ID:"+ID + " \nName:" + name + " \nAddress:" + Address + " \nDepartment:" + Department + " \ncourse: " + course);
    		 input.close();
        } else {
        	result = ("ID " + ID_To_Find + " doesn't exist!");
        }
        
        return result;
    }
	
	static void update_file(String U_ID, St_info info) throws IOException {
	    File file = new File("st_info");
	    Scanner input = new Scanner(file);
	    File tempFile = new File("temp_st_info"); // 임시 파일 생성
	    PrintWriter output = new PrintWriter(new FileWriter(tempFile));
	    String ID;

	    try {
	        while (input.hasNext()) {
	            ID = input.next();
	            if (U_ID.equals(ID)) {
	                String Upd_ID = info.getID();
	                String Name = info.getName();
	                String Address = info.getAdd();
	                String Department = info.getDept();
	                String Courses = info.getCourse();

	                output.println(Upd_ID);
	                output.println(Name);
	                output.println(Address);
	                output.println(Department);
	                output.println(Courses);
	                output.println();

	                // 업데이트가 완료되면 해당 라인 넘기기
	                for (int i = 0; i < 5; i++) {
	                    if (input.hasNext()) {
	                        input.next();
	                    }
	                }
	            } else {
	                output.println(ID);
	                for (int i = 0; i < 4; i++) {
	                    if (input.hasNext()) {
	                        output.println(input.next());
	                    }
	                }
	                output.println();
	            }
	        }
	    } finally {
	        input.close();
	        output.close();
	    }

	    // 기존 파일 삭제 및 임시 파일을 원본 파일로 변경
	    if (file.delete()) {
	        if (!tempFile.renameTo(file)) {
	            System.out.println("Error replacing the file.");
	        } else {
	            System.out.println("Update success");
	        }
	    } else {
	        System.out.println("Failed to delete the file.");
	        System.out.println("Is file readable: " + file.canRead());
	        System.out.println("Is file writable: " + file.canWrite());
	        System.out.println("Is file executable: " + file.canExecute());
	        System.out.println("Does file exist: " + file.exists());
	    }
	}



		
}
