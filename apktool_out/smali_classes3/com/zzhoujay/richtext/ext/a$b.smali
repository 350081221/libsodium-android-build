.class abstract Lcom/zzhoujay/richtext/ext/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zzhoujay/richtext/ext/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation


# instance fields
.field public a:[B

.field public b:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/zzhoujay/richtext/ext/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zzhoujay/richtext/ext/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(I)I
.end method

.method public abstract b([BIIZ)Z
.end method
