package ex03;

public class MysqldDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql에서 검색");
		
	}

	@Override
	public void insert() {
		
		System.out.println("MySql에서 삭제");
		
	}

	@Override
	public void update() {
		
		System.out.println("MySql에서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql에서 삭제");
		
		
	}

}
