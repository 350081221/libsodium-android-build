.class Lcom/zzhoujay/richtext/ig/c;
.super Lcom/zzhoujay/richtext/ig/a;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zzhoujay/richtext/ig/a<",
        "[B>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/zzhoujay/richtext/c;Lcom/zzhoujay/richtext/g;Landroid/widget/TextView;Lcom/zzhoujay/richtext/drawable/c;Le3/g;)V
    .locals 7

    sget-object v6, Lcom/zzhoujay/richtext/ig/o;->a:Lcom/zzhoujay/richtext/ig/o;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/zzhoujay/richtext/ig/a;-><init>(Lcom/zzhoujay/richtext/c;Lcom/zzhoujay/richtext/g;Landroid/widget/TextView;Lcom/zzhoujay/richtext/drawable/c;Le3/g;Lcom/zzhoujay/richtext/ig/o;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/a;->a:Lcom/zzhoujay/richtext/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/c;->k()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/zzhoujay/richtext/ext/a;->a(Ljava/lang/String;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Lcom/zzhoujay/richtext/ig/a;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    new-instance v1, Lf3/f;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lf3/f;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/zzhoujay/richtext/ig/a;->onFailure(Ljava/lang/Exception;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_1
    move-exception v0

    .line 26
    new-instance v1, Lf3/f;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Lf3/f;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lcom/zzhoujay/richtext/ig/a;->onFailure(Ljava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void
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
.end method
