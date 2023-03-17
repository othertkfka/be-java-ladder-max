package kr.codesquad.view;

import kr.codesquad.domain.Validator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String inputName() {
        System.out.println("참여할 사람 이름을 입력하세요.(이름은 쉼표(,)로 구분)");
        while(true){
            try {
                return Validator.validateName(br.readLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String inputResult() {
        System.out.println("실행 결과를 입력하세요.(결과는 쉼표(,)로 구분)");
        while(true){
            try {
                return br.readLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int inputHeight() {
        System.out.println("사다리 높이를 입력하세요.");
        while(true){
            try {
                return Validator.validateHeight(Integer.parseInt(br.readLine()));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String inputNameCommand() {
        System.out.println("결과를 보고 싶은 사람의 이름을 입력하세요.");
        while(true){
            try {
                return br.readLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
