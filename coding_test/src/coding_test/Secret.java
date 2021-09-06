
public class Secret {
	public int Secret(int n) {
		int s = 0;
		for(int i = 1; i < n; i++) {
			for (int j = i+1; j <= n; j++) {
				s = s + 1;
			}
		}
		return s;
	}
}
