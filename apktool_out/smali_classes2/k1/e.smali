.class public Lk1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lj1/f;)Lcom/bytedance/mtesttools/b/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj1/f;->k()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p0, v0, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    if-eq p0, v0, :cond_0

    .line 13
    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :pswitch_0
    new-instance p0, Lcom/bytedance/mtesttools/b/i;

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/bytedance/mtesttools/b/i;-><init>()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_1
    new-instance p0, Lcom/bytedance/mtesttools/b/e;

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/bytedance/mtesttools/b/e;-><init>()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_2
    new-instance p0, Lcom/bytedance/mtesttools/b/g;

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/bytedance/mtesttools/b/g;-><init>()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_3
    new-instance p0, Lcom/bytedance/mtesttools/b/j;

    .line 38
    .line 39
    invoke-direct {p0}, Lcom/bytedance/mtesttools/b/j;-><init>()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance p0, Lcom/bytedance/mtesttools/b/f;

    .line 44
    .line 45
    invoke-direct {p0}, Lcom/bytedance/mtesttools/b/f;-><init>()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance p0, Lcom/bytedance/mtesttools/b/k;

    .line 50
    .line 51
    invoke-direct {p0}, Lcom/bytedance/mtesttools/b/k;-><init>()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    new-instance p0, Lcom/bytedance/mtesttools/b/d;

    .line 56
    .line 57
    invoke-direct {p0}, Lcom/bytedance/mtesttools/b/d;-><init>()V

    .line 58
    .line 59
    .line 60
    :goto_0
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
