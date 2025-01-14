package data.structures.linkedlist;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

// Test Cases for Linked List
public class SinglyLinkedListTest {

    SinglyLinkedList linkedList = new SinglyLinkedList();

    @TestFactory
    Collection<DynamicTest> SinglyLinkedListTestCases() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Test Case 1 - Display null Linked List",
                        () -> {
                            assertEquals("head --> null", linkedList.display(linkedList.getHead()));
                        }

                ),
                DynamicTest.dynamicTest("Test Case 2 - Check Length",
                        () -> {
                            assertEquals(0, linkedList.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 3 - Insert 10 as first node",
                        () -> {
                            linkedList.insertFirst(10);
                            assertEquals("head --> 10 --> null", linkedList.display(linkedList.getHead()));
                        }

                ),
                DynamicTest.dynamicTest("Test Case 4 - Push 20 as first node",
                        () -> {
                            linkedList.insertFirst(20);
                            assertEquals("head --> 20 --> 10 --> null", linkedList.display(linkedList.getHead()));
                        }

                ),
                DynamicTest.dynamicTest("Test Case 5 - Check Length",
                        () -> {
                            assertEquals(2, linkedList.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 6 - Push 15 as last node",
                        () -> {
                            linkedList.insertLast(15);
                            assertEquals("head --> 20 --> 10 --> 15 --> null", linkedList.display(linkedList.getHead()));
                        }

                ),
                DynamicTest.dynamicTest("Test Case 7 - Push 16 as last node",
                        () -> {
                            linkedList.insertLast(16);
                            assertEquals("head --> 20 --> 10 --> 15 --> 16 --> null", linkedList.display(linkedList.getHead()));
                        }

                ),
                DynamicTest.dynamicTest("Test Case 8 - Assert Not Equal to compare 16 as last node",
                        () -> {
                            assertNotEquals("head --> 20 --> 10 --> 15 --> null", linkedList.display(linkedList.getHead()));
                        }

                ),
                DynamicTest.dynamicTest("Test Case 9 - Push 23 as second node",
                        () -> {
                            linkedList.insertByPosition(2, 23);
                            assertEquals("head --> 20 --> 23 --> 10 --> 15 --> 16 --> null", linkedList.display(linkedList.getHead()));
                        }

                ),
                DynamicTest.dynamicTest("Test Case 10 - Push 23 as last node using insertByPosition method",
                        () -> {
                            linkedList.insertByPosition(6, 23);
                            assertEquals("head --> 20 --> 23 --> 10 --> 15 --> 16 --> 23 --> null", linkedList.display(linkedList.getHead()));
                        }

                ),
                DynamicTest.dynamicTest("Test Case 11 - Push 99 as first node using insertByPosition method",
                        () -> {
                            linkedList.insertByPosition(1, 99);
                            assertEquals("head --> 99 --> 20 --> 23 --> 10 --> 15 --> 16 --> 23 --> null", linkedList.display(linkedList.getHead()));
                        }

                ),
                DynamicTest.dynamicTest("Test Case 12 - Check length = 7",
                        () -> {
                            assertEquals(7, linkedList.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 13 - Check length != 17",
                        () -> {
                            assertNotEquals(17, linkedList.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 14 - Delete first node and compare length as 6",
                        () -> {
                            linkedList.deleteFirst();
                            assertEquals("head --> 20 --> 23 --> 10 --> 15 --> 16 --> 23 --> null", linkedList.display(linkedList.getHead()));
                            assertEquals(6, linkedList.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 15 - Delete last node and compare length as 5",
                        () -> {
                            linkedList.deleteLast();
                            assertEquals("head --> 20 --> 23 --> 10 --> 15 --> 16 --> null", linkedList.display(linkedList.getHead()));
                            assertEquals(5, linkedList.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 16 - Delete second node by using deleteByPositionMethod and compare length as 4",
                        () -> {
                            linkedList.delete(2);
                            assertEquals("head --> 20 --> 10 --> 15 --> 16 --> null", linkedList.display(linkedList.getHead()));
                            assertEquals(4, linkedList.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 17 - Delete last node by using deleteByPositionMethod and compare length as 3",
                        () -> {
                            linkedList.delete(4);
                            assertEquals("head --> 20 --> 10 --> 15 --> null", linkedList.display(linkedList.getHead()));
                            assertEquals(3, linkedList.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 18 - Delete first node by using deleteByPositionMethod and compare length as 5",
                        () -> {
                            linkedList.delete(1);
                            assertEquals("head --> 10 --> 15 --> null", linkedList.display(linkedList.getHead()));
                            assertEquals(2, linkedList.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 19 - Adding 27, 37, 47, 57, 67, 1, 9, 6 to the end and compare length as 10",
                        () -> {
                            linkedList.insertLast(27);
                            linkedList.insertLast(37);
                            linkedList.insertLast(47);
                            linkedList.insertLast(57);
                            linkedList.insertLast(67);
                            linkedList.insertLast(1);
                            linkedList.insertLast(9);
                            linkedList.insertLast(6);
                            assertEquals("head --> 10 --> 15 --> 27 --> 37 --> 47 --> 57 --> 67 --> 1 --> 9 --> 6 --> null", linkedList.display(linkedList.getHead()));
                            assertEquals(10, linkedList.length());
                        }

                ),
                DynamicTest.dynamicTest("Test Case 20 - Find 57",
                        () -> {
                            assertTrue(linkedList.find(57));
                        }

                ),
                DynamicTest.dynamicTest("Test Case 21 - Do not find 507",
                        () -> {
                            assertFalse(linkedList.find(507));
                        }

                ),
                DynamicTest.dynamicTest("Test Case 22 - Find 6 which is last node",
                        () -> {
                            assertTrue(linkedList.find(6));
                        }

                ),
                DynamicTest.dynamicTest("Test Case 23 - Reverse Linked List",
                        () -> {
                            assertEquals("head --> 6 --> 9 --> 1 --> 67 --> 57 --> 47 --> 37 --> 27 --> 15 --> 10 --> null", linkedList.display(linkedList.reverse()));
                        }

                )
        );
    }
}