package ru.nikita.problem605;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int freePlaces = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {

            boolean isNextFree = (i == len - 1) || flowerbed[i + 1] == 0;
            boolean isPrevFree = (i == 0) || flowerbed[i - 1] == 0;

            if (isNextFree && isPrevFree && flowerbed[i] == 0) {
                freePlaces++;
                flowerbed[i] = 1;
            }
        }

        return freePlaces >= n;
    }

}
