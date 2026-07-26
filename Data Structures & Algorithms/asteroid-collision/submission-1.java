class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        asteroid:
        for (int current : asteroids) {

            while (!stack.isEmpty()
                    && stack.peek() > 0
                    && current < 0) {

                int top = stack.peek();

                if (top < Math.abs(current)) {
                    stack.pop();
                    // Current survives; check the next stack asteroid
                } else if (top == Math.abs(current)) {
                    stack.pop();
                    continue asteroid; // Both destroyed; skip pushing current
                } else {
                    continue asteroid; // Current destroyed; skip pushing it
                }
            }

            stack.push(current);
        }

        int[] result = new int[stack.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}