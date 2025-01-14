package data.structures.stack;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

    MyStack stack = new MyStack();

    @TestFactory
    Collection<DynamicTest> StackTestCases() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Test Case 1 - Check isEmpty",
                        () -> {
                                assertEquals(true, stack.isEmpty());
                                }

                ),
                DynamicTest.dynamicTest("Test Case 2 - Check Length",
                        () -> {
                                assertEquals(0, stack.length());
                                }

                ),
                DynamicTest.dynamicTest("Test Case 3 - Push 10 and Check Length",
                        () -> {
                            stack.push(10);
                            assertEquals(1, stack.length());
                            }

                ),
                DynamicTest.dynamicTest("Test Case 4 - Push 20 and Check Length",
                        () -> {
                            stack.push(20);
                            assertEquals(2, stack.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 5 - Peek to get 20",
                        () -> {
                            assertEquals(20, stack.peek());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 6 - Push 15 and Check Length",
                        () -> {
                            stack.push(15);
                            assertEquals(3, stack.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 7 - Pop, Compare Value and Check Length",
                        () -> {

                            assertEquals(15, stack.pop());
                            assertEquals(2, stack.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 8 - Check isEmpty",
                        () -> {

                            assertEquals(false, stack.isEmpty());
                        }

                )
        );
    }
}