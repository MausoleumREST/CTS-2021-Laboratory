package ro.ase.csie.cts.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class RestorePointsManager {
	List<HeroRestorePoint> restorePoints = new ArrayList<HeroRestorePoint>();
	
	public void addRestorePoints(HeroRestorePoint point) {
		this.restorePoints.add(point);
	}
	
	public HeroRestorePoint getRestorePoint(int index) {
		if (index < 0 || index >= restorePoints.size()) {
			throw new UnsupportedOperationException();
		} else {
			HeroRestorePoint point = restorePoints.get(index);
			restorePoints.remove(index);
			return point;
		}
	}
}
