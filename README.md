# MyAnnotation

1. 创建JAVA module 时候，要在build.gradle中添加下面两句：

    targetCompatibility='1.7'
    sourceCompatibility='1.7'
    
    
    一个JAVA module的gradle文件如下：
    apply plugin: 'java'

    dependencies {

        targetCompatibility='1.7'
        sourceCompatibility='1.7'

        compile fileTree(dir: 'libs', include: ['*.jar'])
    }
