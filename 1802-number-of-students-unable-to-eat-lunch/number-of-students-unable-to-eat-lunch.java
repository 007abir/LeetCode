class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> sandwichesStack = new LinkedList<>();
        Queue<Integer> studentsQueue = new LinkedList<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sandwichesStack.push(sandwiches[i]);
        }
        for (int j : students) {
            studentsQueue.add(j);
        }

        int counter = 0;
        while (!sandwichesStack.isEmpty()) {
            int student = studentsQueue.remove();
            if (sandwichesStack.peek() == student) {
                sandwichesStack.pop();
                counter = 0;
            } else {
                studentsQueue.offer(student);
                counter++;
                if (counter == studentsQueue.size()) {
                    return counter;
                }
            }
        }

        return 0;
    }
}