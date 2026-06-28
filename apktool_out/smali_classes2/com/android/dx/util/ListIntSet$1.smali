.class Lcom/android/dx/util/ListIntSet$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/util/IntIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/util/ListIntSet;->iterator()Lcom/android/dx/util/IntIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private idx:I

.field final synthetic this$0:Lcom/android/dx/util/ListIntSet;


# direct methods
.method constructor <init>(Lcom/android/dx/util/ListIntSet;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/util/ListIntSet$1;->this$0:Lcom/android/dx/util/ListIntSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/android/dx/util/ListIntSet$1;->idx:I

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/android/dx/util/ListIntSet$1;->idx:I

    iget-object v1, p0, Lcom/android/dx/util/ListIntSet$1;->this$0:Lcom/android/dx/util/ListIntSet;

    iget-object v1, v1, Lcom/android/dx/util/ListIntSet;->ints:Lcom/android/dx/util/IntList;

    invoke-virtual {v1}, Lcom/android/dx/util/IntList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/ListIntSet$1;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/android/dx/util/ListIntSet$1;->this$0:Lcom/android/dx/util/ListIntSet;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/android/dx/util/ListIntSet;->ints:Lcom/android/dx/util/IntList;

    .line 10
    .line 11
    iget v1, p0, Lcom/android/dx/util/ListIntSet$1;->idx:I

    .line 12
    .line 13
    add-int/lit8 v2, v1, 0x1

    .line 14
    .line 15
    iput v2, p0, Lcom/android/dx/util/ListIntSet$1;->idx:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw v0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
