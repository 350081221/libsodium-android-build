.class public final Lu/dont/know/what/i/am/p$a;
.super Lu/dont/know/what/i/am/q$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/dont/know/what/i/am/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/ClassLoader;

.field public f:Landroid/content/pm/ApplicationInfo;

.field public g:Z


# direct methods
.method public constructor <init>(Lu/dont/know/what/i/am/j$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu/dont/know/what/i/am/j$c<",
            "Lu/dont/know/what/i/am/p;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lu/dont/know/what/i/am/q$a;-><init>(Lu/dont/know/what/i/am/j$c;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/swift/sandhook/xcompat/a;->packageName:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p1, p0, Lu/dont/know/what/i/am/p$a;->c:Ljava/lang/String;

    .line 7
    .line 8
    sget-object p1, Lcom/swift/sandhook/xcompat/a;->processName:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p1, p0, Lu/dont/know/what/i/am/p$a;->d:Ljava/lang/String;

    .line 11
    .line 12
    sget-object p1, Lcom/swift/sandhook/xcompat/a;->classLoader:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    iput-object p1, p0, Lu/dont/know/what/i/am/p$a;->e:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    sget-object p1, Lcom/swift/sandhook/xcompat/a;->context:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lu/dont/know/what/i/am/p$a;->f:Landroid/content/pm/ApplicationInfo;

    .line 23
    .line 24
    sget-boolean p1, Lcom/swift/sandhook/xcompat/a;->isFirstApplication:Z

    .line 25
    .line 26
    iput-boolean p1, p0, Lu/dont/know/what/i/am/p$a;->g:Z

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
