variable "region" {
  description = "AWS region"
  type        = string
  default     = "ap-northeast-2"
}

variable "prefix" {
  description = "Resource name prefix"
  type        = string
  default     = "likelion-cicd"
}

variable "key_pair_name" {
  description = "EC2 key pair name (must already exist in AWS)"
  type        = string
  default     = "likelion-key"
}

variable "instance_type" {
  description = "EC2 instance type"
  type        = string
  default     = "t2.micro"
}

variable "vpc_cidr" {
  description = "VPC CIDR block"
  type        = string
  default     = "10.0.0.0/16"
}

variable "public_subnet_cidr" {
  description = "Public subnet CIDR block"
  type        = string
  default     = "10.0.1.0/24"
}
