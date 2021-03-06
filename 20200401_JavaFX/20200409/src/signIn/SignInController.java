package signIn;

import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class SignInController implements Initializable {
	@FXML CheckBox cb;
	@FXML TextField idTf, pwdTf;
	@FXML Button btn;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn.setOnAction(e -> handleBtnAction(e));
		
		idTf.textProperty().addListener((obs, oldT, newT) -> {
			checkFieldLength(idTf);
			checkEscapeText(idTf);
		});
	}

	private ICommonService comServ;
	comServ = new CommonService();
	
	private void checkEscapeText(TextField txt) {
		txt.setText(txt.getText().replaceAll("[^a-zA-Z0-9_]", ""));
	}
		/*
		   ==================== [주요 기호] ====================
			^  문장의 시작
			$  문장의 끝
			abc  abc가 반드시 나옴
			[abc]  abc중에 1개가 반드시 나옴
			[a-c]  a부터 c사이에서 1개가 반드시 나옴
			[a-c]{5}  a부터 c사이의 글자가 반드시 5개 나옴
			[a-c]{5, 10} a부터 c사이의 글자가 반드시 5~10개 나옴
			[a-c]{5, }  a부터 c사이의 글자가 반드시 5개 이상 나옴
			[a-zA-Z]  알파벳 중 1글자
			[0-9]  숫자중 1개
			[가-힣]  완성된 한글 1글자
			[ㄱ-ㅎ]  자음 1개
			[ㅏ-ㅣ]  모음 1개
			a?  a가 있을 수도 있고, 없을 수도 있다(0 or 1)
			a{0, 1}  사용 불가, {}에는 0을 적을 수 없다
			특수문자
			\d  [0-9]와 동일
			\w  [a-zA-Z0-9_]와 동일
			\s  white space, 띄어쓰기
			.  아무 글자나 가능(any character)
			[0-9]+  숫자 1개 이상
			[0-9]*  숫자 0개 이상
			[0-9]?  숫자 0개 또는 1개
			==================================================
		 */

	private void checkFieldLength(TextField txt) {
		if(txt.getText().length() > 10)
			txt.deleteNextChar();
	}

	private void handleBtnAction(ActionEvent e) {
		String id = idTf.getText();
		String pwd = pwdTf.getText();
		
		//pwd = encryptSHA512(pwd);
		
		if(!cb.isSelected())
			idTf.clear();
		pwdTf.clear();
	}

}
