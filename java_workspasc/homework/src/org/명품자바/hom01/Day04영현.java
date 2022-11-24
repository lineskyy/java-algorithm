package org.java.hom01;

import java.util.*;

public class Day04영현 {

    private final int [] numbers = new int[6];

    private static final Random RANDOM = new Random();

    public int[] generateUseStream(){
        for(int i=0; i<this.numbers.length; i++){
            int currentNumber = RANDOM.nextInt(45);
            while (isDuplicatedUseStream(currentNumber) ){
                currentNumber = RANDOM.nextInt(45);
            }
            this.numbers[i] = currentNumber;
        }
        return this.numbers;
    }

    public int[] generateUseFor(){
        for(int i=0; i<this.numbers.length; i++){
            int currentNumber = RANDOM.nextInt(45);
            while (isDuplicateUseFor(currentNumber) ){
                currentNumber = RANDOM.nextInt(45);
            }
            this.numbers[i] = currentNumber;
        }
        return this.numbers;
    }

    public Set<Integer> generateWithCollection(){
        final Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < 7){
            numberSet.add(RANDOM.nextInt(45));
        }
        return numberSet;
    }

    private boolean isDuplicatedUseStream(int number){
        return Arrays.stream(numbers).anyMatch((_number)-> number == _number);
    }

    private boolean isDuplicateUseFor(int number){
        boolean flag = false;
        for(int num: this.numbers){
            flag = num == number;
            break;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("SET ==============================");
        Day04영현 lotto = new Day04영현();
        Set<Integer> set = lotto.generateWithCollection();
        System.out.println(set.toString());

        System.out.println("FOR ==============================");
        int[] nums1 = lotto.generateUseFor();
        for(int n : nums1) System.out.printf("%d,",n);
        System.out.println("");

        System.out.println("Stream ==============================");
        int[] nums2 = lotto.generateUseStream();
        for(int n : nums2) System.out.printf("%d,",n);
        System.out.println("");

    }

}
