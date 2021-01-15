package amazon;

import java.util.List;
import java.util.ArrayList;
/**
 * @author Simar Preet
 */
public class Cells {
    public static void main (String args[]){
        Cells c = new Cells();
        int[] states = new int[]{1,0,0,0,0,1,0,0};
        c.cellCompete(states,1);
    }

    public List<Integer> cellCompete(int[] states, int days)
    {
        List<Integer> result = new ArrayList<Integer>();
        int length = states.length;

        for (int i=0;i<days;i++){
            // outer cells
            if (states[1] == 0){
                states[0] = 0;
            }
            if(states[length-1] == 0){
                states[length-1] = 0;
            }
            // inner cells
            for (int j=1;j<length-1;j++){
                if(states[j-1] == states[j+1]){
                    states[j] = 0;
                }else {
                    states[j] = 1;
                }
            }
        }
        for (int a = 0; a< length; a++){
            result.add(states[a]);
        }
        return result;
    }
    }
