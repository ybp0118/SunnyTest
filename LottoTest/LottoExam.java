package LottoTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoExam {

	private int OutoSort, ManualSort, Lottoselect;
	private int[] Outonumber, Winnumber, UserInput;
	private static Scanner sn;

	public void OutoLotto(int Lottoselect) {

		this.Lottoselect = Lottoselect;
		Outonumber = new int[6];
		Random rd = new Random();
		if (Lottoselect == 1) {

			for (int i = 0; i < 6; i++) {
				Outonumber[i] = rd.nextInt(45) + 1;
				for (int j = 0; j < i; j++) {
					if (Outonumber[i] == Outonumber[j]) {
						i = i - 1;
						break;
					}
				}
			}
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j <= i; j++) {
					if (Outonumber[i] <= Outonumber[j]) {
						OutoSort = Outonumber[i];
						Outonumber[i] = Outonumber[j];
						Outonumber[j] = OutoSort;
					}
				}
			}
			System.out.println("�ڵ���÷�� ��ȣ: \n");

			for (int i = 0; i < Outonumber.length; i++) {
				System.out.print("[" + Outonumber[i] + "]" + " ");
			}
			System.out.println();

		}
	}

	public void ManualLotto(int Lottoselect) {

		int[] UserInput = new int[6];
		if (Lottoselect == 2) {

			System.out.println("1~45������ ���ڸ� ������� �Է��ϼ���");

			for (int i = 0; i < UserInput.length; i++) {
				sn = new Scanner(System.in);
				UserInput[i] = sn.nextInt();

				if (UserInput[i] > 0 && UserInput[i] < 46) {

					for (int j = 0; j < i; j++) {
						if (UserInput[i] == UserInput[j]) {
							System.out.println("�ߺ��Ǵ� �����Դϴ�. �ٽ��Է��ϼ���");
							i--;
						}
					}
				} else {

					System.out.println("������ �ʰ� �ϴ� �����Դϴ�. �ٽ��Է��ϼ���");
					i--;
				}
			}

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < i; j++) {
					if (UserInput[i] <= UserInput[j]) {
						ManualSort = UserInput[i];
						UserInput[i] = UserInput[j];
						UserInput[j] = ManualSort;
					}
				}

			}
			System.out.println("������ ���ڴ�: \n");
			for (int i = 0; i < UserInput.length; i++) {
				System.out.print("[" + UserInput[i] + "]" + " ");

			}
		}
		System.out.println();
	}

	public void WinLotto() {

		int[] Winnumber = new int[6];
		Random rd = new Random();
		for (int i = 0; i < Winnumber.length; i++) {
			Winnumber[i] = rd.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (Winnumber[i] == Winnumber[j]) {
					i = i - 1;

					break;

				}
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				if (Winnumber[i] <= Winnumber[j]) {
					ManualSort = Winnumber[i];
					Winnumber[i] = Winnumber[j];
					Winnumber[j] = ManualSort;
				}
			}
		}
		System.out.println("��÷ ��ȣ: \n");
		for (int i = 0; i < Winnumber.length; i++) {
			System.out.print("[" + Winnumber[i] + "]" + " ");

		}

	}

	public void BonusLotto() {

		int bonusNumber;
		Random bonus = new Random();
		bonusNumber = bonus.nextInt(45) + 1;
		System.out.println("------- ���ʽ� ��ȣ [" + bonusNumber + "]");
		System.out.println();
	}


}
