#!/bin/zsh

# 프로젝트 빌드
echo "📦 Building project..."
./gradlew clean build

# 가장 최근 생성된 JAR 파일 찾기
JAR_FILE=$(ls build/libs/*.jar | grep -v 'plain' | head -n 1)

# 서버 실행
echo "🚀 Running $JAR_FILE ..."
java -jar "$JAR_FILE"