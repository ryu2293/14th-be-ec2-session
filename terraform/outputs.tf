output "ec2_public_ip" {
  description = "EC2 인스턴스의 퍼블릭 IP (탄력적 IP)"
  value       = aws_eip.app.public_ip
}

output "ec2_instance_id" {
  description = "EC2 인스턴스 ID"
  value       = aws_instance.app.id
}

output "ssh_command" {
  description = "SSH 접속 명령어"
  value       = "ssh -i ${var.key_pair_name}.pem ubuntu@${aws_eip.app.public_ip}"
}

output "app_url" {
  description = "Spring Boot 애플리케이션 접속 URL"
  value       = "http://${aws_eip.app.public_ip}:8080"
}
