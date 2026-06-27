package project.ec2session.domain.user.controller.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import project.ec2session.domain.user.dto.UserReq;

@Tag(name = "Auth", description = "인증 API")
public interface AuthApi {

    @Operation(summary = "로그인", description = "username/password로 로그인하여 JWT 토큰을 발급받습니다.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "로그인 성공 - Access/Refresh 토큰 반환"),
            @ApiResponse(responseCode = "400", description = "요청 값 유효성 검사 실패"),
            @ApiResponse(responseCode = "401", description = "아이디 또는 비밀번호 불일치")
    })
    @PostMapping("/sign-in")
    public ResponseEntity<?> signIn(@RequestBody @Valid UserReq.SignInDto request);

    @Operation(summary = "회원가입", description = "username, password, nickname으로 새 계정을 생성합니다.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "회원가입 성공 - 생성된 userId 반환"),
            @ApiResponse(responseCode = "400", description = "요청 값 유효성 검사 실패"),
            @ApiResponse(responseCode = "409", description = "이미 존재하는 username")
    })
    @PostMapping("/sign-up")
    public ResponseEntity<?> signUp(@RequestBody @Valid UserReq.SignUpDto request);
}
