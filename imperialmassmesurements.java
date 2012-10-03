public class imperialmassmesurements {
	public static void main(String[] args) {
		int totalounces = 3147;
		int tons = totalounces/35840; 
		int weight = (totalounces-tons*35840)/1792;
		int stones = (totalounces-tons*35840-weight*1792)/224;
		int pounds = (totalounces-tons*35840-weight*1792-stones*224)/16;
		int ounces = (totalounces-tons*35840-weight*1792-stones*224-pounds*16);
		System.out.print(totalounces+"ounces is equal to"+tons+"tons"+weight+"hundred weights"+stones+"stones"+pounds+"pounds"+ounces+"ounces");
	}
}
