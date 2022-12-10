public class Check_if_it_is_survival_to_island {
//    You are a poor person in an island. There is only one shop in this island, this shop
//    is open on all days of the week except for Sunday. Consider following constraints:
//
//    N – Maximum unit of food you can buy each day.
//            S – Number of days you are required to survive.
//    M – Unit of food required each day to survive.
//
//    In this problem, the greedy approach of buying the food for some consecutive early days is the right direction.
//    If we can survive for the first 7 days then we can survive any number of days for that we need to check two things
//-> Check whether we can survive one day or not.
//-> (S >= 7) If we buy food in the first 6 days of the week and we can survive for the week i.e. total food we can buy in a week (6*N) is greater then or equal to total food we require to survive in a week (7*M) then we can survive.
//
//    Note : We are buying the food in the first 6 days because we are counting from Monday and the shop will remain close on Sunday.
//    If any of the above conditions are not true then we can’t survive else
//
//    the equation can be derived as :
//
//    the amount of food that we buy should >= the amount of food required to survive.—-> equation 1
//
//    the amount of food that we buy =  number of times we buy (days) * amount of food that we get for one time buy (N)
//
//    the amount of food required to survive = the number of days we need to survive(S) * amount of food required on each day(M).
//
//    now from our equation 1:
//
//    days * N >= S * M
//
//            hence, days = ceil (S * M) / N
//
//    if (((N * 6) < (M * 7) && S > 6) || M > N)
//    cout << "No\n";
//    else {
//        // If we can survive then we can
//        // buy ceil(A/N) times where A is
//        // total units of food required.
//        int days = (M * S) / N;
//        if (((M * S) % N) != 0)
//            days++;
//        cout << "Yes " << days << endl;
//
//    find the minimum number of days we can survive after the week
//    here when we buy the food per day is (N) then how much day the food is stay for (M*S) units
//    we calculate it by (M*S)/N
//    then if we get some remainder after dividing (M*S) by N then we say that some amount of food
//        is left we can use for further days we increment the days
}
