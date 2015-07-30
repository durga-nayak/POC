import com.algo.analysis.linkedlist.ds.BinarySearchTree;

/**
 * 
 */

/**
 * @author Lali
 *
 */
public class TestAlgo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		class Employee implements Comparable<Employee>{
			int age;
			int empId;

			@Override
			public String toString() {
				return "Employee [age=" + age + ", empId=" + empId + "]";
			}

			@Override
			public int compareTo(Employee o) {
				if (this.empId > o.empId){
					return 1;
				}else if (this.empId < o.empId){
					return -1;
				}
				return 0;
			}
		}
		// TODO Auto-generated method stub
		BinarySearchTree<Employee> binarySearchTree = new BinarySearchTree<Employee>();
		Integer[] empId = {1,2,3,4,5,9,12,13,14};
		for (int i=0; i < empId.length; i++){
			Employee employee = new Employee();
			employee.empId = empId[i];
			binarySearchTree.insert(employee);
		}
		System.out.println(binarySearchTree.getSize());
	}

}
