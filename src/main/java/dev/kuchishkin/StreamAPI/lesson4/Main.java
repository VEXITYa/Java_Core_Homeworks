package dev.kuchishkin.StreamAPI.lesson4;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        User user1 = new User("Jack", 25);
        User user2 = new User("Jane", 17);
        User user3 = new User("John", 12);
        User user4 = new User("Bob", 34);
        User user5 = new User("Alice", 31);
        User user6 = new User("Robert", 43);
        User user7 = new User("Dan", 10);

        List<String> result = Stream.of(user1, user2, user3, user4, user5, user6, user7)
                .filter(user -> user.age() > 25)
                .map(User::name)
                .sorted()
                .distinct()
                .toList();
        System.out.println(result);

        var ageSum = Stream.of(user1, user2, user3, user4, user5, user6, user7)
                .map(User::age)
                .reduce(0, Integer::sum);
        System.out.println(ageSum);
    }
}
