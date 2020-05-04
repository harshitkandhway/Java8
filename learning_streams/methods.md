# Working with loops in stream (range)
We need to use the range method in IntStream class to achieve a looping statement in java8.
IntStream.range(startIndex,endIndex)

# When we want to update a List of values (map)
List<Integer> input = Arrays.asList(2,4,7,3);
input.stream().map(i->i*2);

# When we want to filter out numbers using some logic(filter)
input.stream().filter(i->i%2==0) This code will filter out all the even numbers from the original stream.


