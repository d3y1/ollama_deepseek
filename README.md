# ollama_deepseek
A SpringBoot demo, using Spring AI and Ollama to realize DeepSeek-R1 API service call

# Ollama
```
Ollama是专门为本地运行大语言模型设计的工具，操作简单且直观，即使是没有深厚技术背景的用户也能够轻松上手。
Ollama支持多个平台，包括Windows、macOS和Linux，使得用户能够在不同的操作系统环境下都能方便地运行DeepSeek-R1等模型。
通过Ollama，用户能够在个人电脑上实现高效的AI推理，无需依赖云服务，既节省了成本，又能更好地控制数据隐私。
```

```
1. 安装Ollama
https://ollama.com/

2. 验证Ollama安装
# ollama --version

3. 下载DeepSeek-R1(选择1.5b, 配置要求最低)
# ollama run deepseek-r1:1.5b

4. 验证deepseek-r1:1.5b安装
# ollama list
NAME                  ID              SIZE      MODIFIED
deepseek-r1:1.5b      a24b25d8c26z    1.1 GB    50 minutes ago

4. 运行DeepSeek-R1
# ollama run deepseek-r1:1.5b
```

# SpringBoot 配置
pom.xml
```
<dependency>
    <groupId>org.springframework.ai</groupId>
    <artifactId>spring-ai-ollama-spring-boot-starter</artifactId>
    <version>1.0.0-M5</version>
</dependency>
```

application.properties: ollama配置
```
spring.ai.ollama.base-url=http://localhost:11434
spring.ai.ollama.chat.model=deepseek-r1:1.5b
```
