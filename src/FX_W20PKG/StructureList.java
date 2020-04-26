package FX_W20PKG;

public class StructureList {

	private class StructureNode {
		
		private Structure sObj;
		private StructureNode next;
		
		public StructureNode(Structure str, StructureNode strNode) {
			
			this.sObj = str.clone();
			this.next = strNode;
			
		}
		
	}
	
	private StructureNode head;
	
	public StructureList() {
		
		head = null;
		
	}
	
	public void addToStart(Structure str) {
		
		head = new StructureNode(str, head);
	
	}
	
	public void addAtEnd(Structure str) {
		
		if (head == null) {
			head = new StructureNode(str, null);
			return;
		}
		StructureNode sn = head;
		while (sn.next != null) {
			sn = sn.next;
		}
		sn.next = new StructureNode(str, null);
		
	}
	@Override
	public Object clone() {
		
		StructureList sl = new StructureList();
		if (this.head == null) {
			sl.head = null;
		} else {
			sl.head = null;
			StructureNode sn1, sn2;
			sn1 = this.head;	// reference to go through copied list
			sn2 = null;		// reference to construct this list
			while(sn1 != null) {
				if (sl.head == null) {
					sn2 = new StructureNode(sn1.sObj, null);
					sl.head = sn2;
				} else {
					sn2.next = new StructureNode(sn1.sObj, sn1.next);
					sn2 = sn2.next;
				}
				sn1 = sn1.next;
			}
		}		
		return sl;
		
	}
	
	public void append(StructureList sl) {
		
		StructureList slCpy = (StructureList)sl.clone();
		StructureNode sn = head;
		while (sn.next != null) {
			sn = sn.next;
		}
		sn.next = slCpy.head;
		sl.head = null;
		
	}
	
	public void showListContents() {
		
		StructureNode sn = head;
		while (sn != null) {
			if (sn.next != null) {
				System.out.print(sn.sObj.toString() + " ===> \n");
			} else {
				System.out.print(sn.sObj.toString() + " ===> X\n");
			}
			sn = sn.next;
		}
		
	}
	
}
