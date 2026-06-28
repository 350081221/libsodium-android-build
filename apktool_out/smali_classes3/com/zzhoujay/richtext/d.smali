.class public Lcom/zzhoujay/richtext/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:I


# instance fields
.field private final a:Ljava/lang/String;

.field private b:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "#4078C0"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Lcom/zzhoujay/richtext/d;->d:I

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
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zzhoujay/richtext/d;->a:Ljava/lang/String;

    .line 5
    .line 6
    sget p1, Lcom/zzhoujay/richtext/d;->d:I

    .line 7
    .line 8
    iput p1, p0, Lcom/zzhoujay/richtext/d;->b:I

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lcom/zzhoujay/richtext/d;->c:Z

    .line 12
    .line 13
    return-void
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
.end method


# virtual methods
.method public a()I
    .locals 1
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation

    iget v0, p0, Lcom/zzhoujay/richtext/d;->b:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zzhoujay/richtext/d;->c:Z

    return v0
.end method

.method public d(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    iput p1, p0, Lcom/zzhoujay/richtext/d;->b:I

    return-void
.end method

.method public e(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/zzhoujay/richtext/d;->c:Z

    return-void
.end method
