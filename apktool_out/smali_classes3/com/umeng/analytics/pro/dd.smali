.class public final Lcom/umeng/analytics/pro/dd;
.super Lcom/umeng/analytics/pro/de;
.source "SourceFile"


# instance fields
.field private a:[B

.field private b:I

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/de;-><init>()V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/analytics/pro/de;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/dd;->a([B)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/umeng/analytics/pro/de;-><init>()V

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/umeng/analytics/pro/dd;->c([BII)V

    return-void
.end method


# virtual methods
.method public a([BII)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/df;
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/dd;->h()I

    move-result v0

    if-le p3, v0, :cond_0

    move p3, v0

    :cond_0
    if-lez p3, :cond_1

    .line 3
    iget-object v0, p0, Lcom/umeng/analytics/pro/dd;->a:[B

    iget v1, p0, Lcom/umeng/analytics/pro/dd;->b:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 4
    invoke-virtual {p0, p3}, Lcom/umeng/analytics/pro/dd;->a(I)V

    :cond_1
    return p3
.end method

.method public a(I)V
    .locals 1

    .line 5
    iget v0, p0, Lcom/umeng/analytics/pro/dd;->b:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/umeng/analytics/pro/dd;->b:I

    return-void
.end method

.method public a([B)V
    .locals 2

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/umeng/analytics/pro/dd;->c([BII)V

    return-void
.end method

.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/df;
        }
    .end annotation

    return-void
.end method

.method public b([BII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/df;
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "No writing allowed!"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public c([BII)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/analytics/pro/dd;->a:[B

    .line 2
    .line 3
    iput p2, p0, Lcom/umeng/analytics/pro/dd;->b:I

    .line 4
    .line 5
    add-int/2addr p2, p3

    .line 6
    iput p2, p0, Lcom/umeng/analytics/pro/dd;->c:I

    .line 7
    .line 8
    return-void
    .line 9
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
    .line 25
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
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/umeng/analytics/pro/dd;->a:[B

    return-void
.end method

.method public f()[B
    .locals 1

    iget-object v0, p0, Lcom/umeng/analytics/pro/dd;->a:[B

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/umeng/analytics/pro/dd;->b:I

    return v0
.end method

.method public h()I
    .locals 2

    iget v0, p0, Lcom/umeng/analytics/pro/dd;->c:I

    iget v1, p0, Lcom/umeng/analytics/pro/dd;->b:I

    sub-int/2addr v0, v1

    return v0
.end method
