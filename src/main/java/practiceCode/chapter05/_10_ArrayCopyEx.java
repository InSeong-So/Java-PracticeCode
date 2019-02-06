package practiceCode.chapter05;

public class _10_ArrayCopyEx {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		// 원본배열, 원본배열에서 복사할 항목의 시작 인덱스, 새 배열, 새 배열에서 붙여넣을 시작 인덱스, 복사할 개수
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
