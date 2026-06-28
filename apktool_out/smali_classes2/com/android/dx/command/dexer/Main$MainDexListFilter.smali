.class Lcom/android/dx/command/dexer/Main$MainDexListFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/cf/direct/ClassPathOpener$FileNameFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/command/dexer/Main;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MainDexListFilter"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/command/dexer/Main;


# direct methods
.method private constructor <init>(Lcom/android/dx/command/dexer/Main;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$MainDexListFilter;->this$0:Lcom/android/dx/command/dexer/Main;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/command/dexer/Main$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main$MainDexListFilter;-><init>(Lcom/android/dx/command/dexer/Main;)V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, ".class"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lcom/android/dx/command/dexer/Main;->access$900(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$MainDexListFilter;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1000(Lcom/android/dx/command/dexer/Main;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x1

    .line 25
    return p1
    .line 26
    .line 27
    .line 28
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
.end method
