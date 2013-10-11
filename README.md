Exception 모니터링
-------------------------------------

**필요한 Framework**

* ASM 4.1 - Object Web에서 제공 : http://asm.objectweb.org/

**목적**

해당 서비스의 추가적인 소스 작업 없이 배포 후 서비스의 오류(예외)를 캐치할 수 있는지 확인하기 위함.

** 필요한 설정들 **

* **Eclipse의 Run Configuration에 VM arguments에 아래 항목 추가한다.**

```
-Xbootclasspath/p:./target/error-digger-1.0.jar
```

그렇게 해서 ExceptionTest를 실행하면 오류가 ExceptionTracker에 의해 캐치되는 것을 확인할 수 있다.


**기타 BCI 프레임워크들**

* BCEL - Apache 프로젝트에서 제공 : http://jakarta.apache.org/bcel/
* SERP - Sourceforge 프로젝트에서 제공 : http://serp.sourceforge.net/
* Javassist - JBoss 프로젝트에서 제공 : http://www.csg.is.titech.ac.jp/~chiba/javassist/


