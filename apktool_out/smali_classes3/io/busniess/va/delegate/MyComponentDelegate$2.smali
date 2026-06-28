.class Lio/busniess/va/delegate/MyComponentDelegate$2;
.super Lu/dont/know/what/i/am/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/busniess/va/delegate/MyComponentDelegate;->afterApplicationCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/busniess/va/delegate/MyComponentDelegate;


# direct methods
.method constructor <init>(Lio/busniess/va/delegate/MyComponentDelegate;)V
    .locals 0

    iput-object p1, p0, Lio/busniess/va/delegate/MyComponentDelegate$2;->this$0:Lio/busniess/va/delegate/MyComponentDelegate;

    invoke-direct {p0}, Lu/dont/know/what/i/am/g;-><init>()V

    return-void
.end method


# virtual methods
.method protected afterHookedMethod(Lu/dont/know/what/i/am/g$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lu/dont/know/what/i/am/g;->afterHookedMethod(Lu/dont/know/what/i/am/g$a;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "\u52a0\u8f7d\u4e86"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    iget-object v1, p1, Lu/dont/know/what/i/am/g$a;->e:[Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "test"

    .line 28
    .line 29
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    iget-object v0, p1, Lu/dont/know/what/i/am/g$a;->e:[Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    aget-object v0, v0, v1

    .line 36
    .line 37
    check-cast v0, Ljava/lang/String;

    .line 38
    .line 39
    const-string v2, "TencentLocation_sapp"

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    iget-object p1, p1, Lu/dont/know/what/i/am/g$a;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ljava/lang/ClassLoader;

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    new-array v0, v0, [Ljava/lang/Object;

    .line 53
    .line 54
    const-class v2, Ljava/lang/String;

    .line 55
    .line 56
    aput-object v2, v0, v1

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    const-class v2, [B

    .line 60
    .line 61
    aput-object v2, v0, v1

    .line 62
    .line 63
    new-instance v1, Lio/busniess/va/delegate/MyComponentDelegate$2$1;

    .line 64
    .line 65
    invoke-direct {v1, p0}, Lio/busniess/va/delegate/MyComponentDelegate$2$1;-><init>(Lio/busniess/va/delegate/MyComponentDelegate$2;)V

    .line 66
    .line 67
    .line 68
    const/4 v2, 0x2

    .line 69
    aput-object v1, v0, v2

    .line 70
    .line 71
    const-string v1, "c.t.m.sapp.g.dm"

    .line 72
    .line 73
    const-string v2, "a"

    .line 74
    .line 75
    invoke-static {v1, p1, v2, v0}, Lu/dont/know/what/i/am/k;->n(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lu/dont/know/what/i/am/g$b;

    .line 76
    .line 77
    .line 78
    :cond_0
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
