package mcis.jsu.edu.crosswordmagic;

import android.support.v4.app.*;

public class TabPagerAdapter extends FragmentPagerAdapter {

    public static final int MAIN_FRAGMENT = 0;
    public static final int PUZZLE_FRAGMENT = 1;
    public static final int CLUES_FRAGMENT = 2;

    int tabCount;

    private MainFragmentView mainFragmentView;
    private PuzzleFragmentView puzzleFragmentView;
    private CluesFragmentView cluesFragmentView;

    public TabPagerAdapter(FragmentManager fm, int numTabs) {

        super(fm);
        this.tabCount = numTabs;

        mainFragmentView = new MainFragmentView();
        puzzleFragmentView = new PuzzleFragmentView();
        cluesFragmentView = new CluesFragmentView();

    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case MAIN_FRAGMENT: return mainFragmentView;
            case PUZZLE_FRAGMENT: return puzzleFragmentView;
            case CLUES_FRAGMENT: return cluesFragmentView;
            default: return null;

        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }

}