.class public final Landroidx/compose/runtime/changelist/Operations$OpIterator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/changelist/OperationArgContainer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/changelist/Operations;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "OpIterator"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\rH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ&\u0010\u0010\u001a\u0002H\u0011\"\u0004\u0008\u0000\u0010\u00112\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u0002H\u00110\u0012H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/compose/runtime/changelist/Operations$OpIterator;",
        "Landroidx/compose/runtime/changelist/OperationArgContainer;",
        "(Landroidx/compose/runtime/changelist/Operations;)V",
        "intIdx",
        "",
        "objIdx",
        "opIdx",
        "operation",
        "Landroidx/compose/runtime/changelist/Operation;",
        "getOperation",
        "()Landroidx/compose/runtime/changelist/Operation;",
        "getInt",
        "parameter",
        "Landroidx/compose/runtime/changelist/Operation$IntParameter;",
        "getInt-w8GmfQM",
        "(I)I",
        "getObject",
        "T",
        "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;",
        "getObject-31yXWZQ",
        "(I)Ljava/lang/Object;",
        "next",
        "",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private intIdx:I

.field private objIdx:I

.field private opIdx:I

.field final synthetic this$0:Landroidx/compose/runtime/changelist/Operations;


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/changelist/Operations;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->this$0:Landroidx/compose/runtime/changelist/Operations;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInt-w8GmfQM(I)I
    .locals 2

    iget-object v0, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->this$0:Landroidx/compose/runtime/changelist/Operations;

    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operations;->access$getIntArgs$p(Landroidx/compose/runtime/changelist/Operations;)[I

    move-result-object v0

    iget v1, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->intIdx:I

    add-int/2addr v1, p1

    aget p1, v0, v1

    return p1
.end method

.method public getObject-31yXWZQ(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->this$0:Landroidx/compose/runtime/changelist/Operations;

    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operations;->access$getObjectArgs$p(Landroidx/compose/runtime/changelist/Operations;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->objIdx:I

    add-int/2addr v1, p1

    aget-object p1, v0, v1

    return-object p1
.end method

.method public final getOperation()Landroidx/compose/runtime/changelist/Operation;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->this$0:Landroidx/compose/runtime/changelist/Operations;

    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operations;->access$getOpCodes$p(Landroidx/compose/runtime/changelist/Operations;)[Landroidx/compose/runtime/changelist/Operation;

    move-result-object v0

    iget v1, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->opIdx:I

    aget-object v0, v0, v1

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final next()Z
    .locals 4

    .line 1
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->opIdx:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->this$0:Landroidx/compose/runtime/changelist/Operations;

    .line 4
    .line 5
    invoke-static {v1}, Landroidx/compose/runtime/changelist/Operations;->access$getOpCodesSize$p(Landroidx/compose/runtime/changelist/Operations;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/runtime/changelist/Operations$OpIterator;->getOperation()Landroidx/compose/runtime/changelist/Operation;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->intIdx:I

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    add-int/2addr v1, v3

    .line 24
    iput v1, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->intIdx:I

    .line 25
    .line 26
    iget v1, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->objIdx:I

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v1, v0

    .line 33
    iput v1, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->objIdx:I

    .line 34
    .line 35
    iget v0, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->opIdx:I

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    add-int/2addr v0, v1

    .line 39
    iput v0, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->opIdx:I

    .line 40
    .line 41
    iget-object v3, p0, Landroidx/compose/runtime/changelist/Operations$OpIterator;->this$0:Landroidx/compose/runtime/changelist/Operations;

    .line 42
    .line 43
    invoke-static {v3}, Landroidx/compose/runtime/changelist/Operations;->access$getOpCodesSize$p(Landroidx/compose/runtime/changelist/Operations;)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-ge v0, v3, :cond_1

    .line 48
    .line 49
    move v2, v1

    .line 50
    :cond_1
    return v2
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method
