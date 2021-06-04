import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class SolutionDemo {

    private Stack<Integer> result = new Stack<>();
    private Stack<Integer> stack = new Stack<>();

    public Stack<Integer> implementStack(Stack<Integer> stack) {
      this.stack = stack;
            for (Integer i: stack){
                stack.pop();
                result.push(i);
            }
        return result;
    }

    public void implementEnqueue(Integer i){
        stack.push(i);
        for (Integer num: stack){
            stack.pop();
            result.push(num);
        }
    }

    public Integer implementDequeue(Integer i){
      if(!result.isEmpty()) {
          return result.pop();
      }
      return null;
    }
}