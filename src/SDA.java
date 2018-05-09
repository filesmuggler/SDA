/*
************************************************************************
Copyright 2018 Krzysztof Stê¿a³a

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
************************************************************************
*/

import java.util.Scanner;
import java.io.IOException;
import static javafx.application.Platform.exit;

/**
 * 
 * @author filesmuggler
 *
 */

public class SDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        //code application logic here
        char answer='x';
        
        do{
            System.out.println("Divide(d), merge(m) or exit(e)?");
            answer = (char) System.in.read();
        }while(answer != 'd' & answer !='m' & answer!='e');
        
        if(answer == 'd'){
            FileDivider divider = new FileDivider();
            divider.chooseFile();
            try {
                divider.divideFile();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
        else if(answer == 'm'){
            //merge
        	FileMerger merger = new FileMerger();
        	merger.chooseFiles();
        	try {
        		merger.mergeFiles();
        	}
        	catch(IOException e) {
        		e.printStackTrace();
        	}
        }
        else if(answer == 'e'){
            exit();
        }
        else{
            System.out.println("error");
        }
        
        
        
        
    }
    
}