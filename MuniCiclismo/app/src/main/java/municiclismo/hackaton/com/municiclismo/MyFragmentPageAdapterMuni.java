package municiclismo.hackaton.com.municiclismo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import municiclismo.hackaton.com.municiclismo.BicicletearFragment;
import municiclismo.hackaton.com.municiclismo.PerfilFragment;
import municiclismo.hackaton.com.municiclismo.PremiosFragment;
import municiclismo.hackaton.com.municiclismo.RankingFragment;
import municiclismo.hackaton.com.municiclismo.ParqueosFragment;

public class MyFragmentPageAdapterMuni extends FragmentPagerAdapter{
	
	final int PAGE_COUNT = 5;
	
	/** Constructor of the class */
	public MyFragmentPageAdapterMuni(FragmentManager fm) {
		super(fm);
		
	}

	/** This method will be invoked when a page is requested to create */
	@Override
	public Fragment getItem(int arg0) {
		Bundle data = new Bundle();
		switch(arg0){
		
			/** tab1 is selected */
			case 0:
				BicicletearFragment fragment1 = new BicicletearFragment();				
				return fragment1;
				
			/** tab2 is selected */
			case 1:
				PerfilFragment fragment2 = new PerfilFragment();
				return fragment2;	
				
			/** tab1 is selected */
			case 2:
				CustomizedListView fragment3 = new CustomizedListView();				
				return fragment3;
				
			/** tab2 is selected */
			case 3:
				RankingListView fragment4 = new RankingListView();
				return fragment4;
				
			case 4:
				ParqueosFragment fragment5 = new ParqueosFragment();
				return fragment5;	
		}
		
		return null;
	}

	/** Returns the number of pages */
	@Override
	public int getCount() {		
		return PAGE_COUNT;
	}
}