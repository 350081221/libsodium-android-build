.class public final Lkotlin/random/f$a;
.super Lkotlin/random/f;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/random/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/random/f$a$a;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH\u0016J \u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0008\u0010\u0015\u001a\u00020\u0016H\u0016J\u0008\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0008\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\u0008\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lkotlin/random/Random$Default;",
        "Lkotlin/random/Random;",
        "Ljava/io/Serializable;",
        "Lkotlin/io/Serializable;",
        "()V",
        "defaultRandom",
        "nextBits",
        "",
        "bitCount",
        "nextBoolean",
        "",
        "nextBytes",
        "",
        "array",
        "fromIndex",
        "toIndex",
        "size",
        "nextDouble",
        "",
        "until",
        "from",
        "nextFloat",
        "",
        "nextInt",
        "nextLong",
        "",
        "writeReplace",
        "",
        "Serialized",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/random/f;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Lkotlin/random/f$a;-><init>()V

    return-void
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lkotlin/random/f$a$a;->INSTANCE:Lkotlin/random/f$a$a;

    return-object v0
.end method


# virtual methods
.method public nextBits(I)I
    .locals 1

    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkotlin/random/f;->nextBits(I)I

    move-result p1

    return p1
.end method

.method public nextBoolean()Z
    .locals 1

    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/random/f;->nextBoolean()Z

    move-result v0

    return v0
.end method

.method public nextBytes(I)[B
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkotlin/random/f;->nextBytes(I)[B

    move-result-object p1

    return-object p1
.end method

.method public nextBytes([B)[B
    .locals 1
    .param p1    # [B
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkotlin/random/f;->nextBytes([B)[B

    move-result-object p1

    return-object p1
.end method

.method public nextBytes([BII)[B
    .locals 1
    .param p1    # [B
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lkotlin/random/f;->nextBytes([BII)[B

    move-result-object p1

    return-object p1
.end method

.method public nextDouble()D
    .locals 2

    .line 1
    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/random/f;->nextDouble()D

    move-result-wide v0

    return-wide v0
.end method

.method public nextDouble(D)D
    .locals 1

    .line 2
    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lkotlin/random/f;->nextDouble(D)D

    move-result-wide p1

    return-wide p1
.end method

.method public nextDouble(DD)D
    .locals 1

    .line 3
    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lkotlin/random/f;->nextDouble(DD)D

    move-result-wide p1

    return-wide p1
.end method

.method public nextFloat()F
    .locals 1

    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/random/f;->nextFloat()F

    move-result v0

    return v0
.end method

.method public nextInt()I
    .locals 1

    .line 1
    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/random/f;->nextInt()I

    move-result v0

    return v0
.end method

.method public nextInt(I)I
    .locals 1

    .line 2
    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkotlin/random/f;->nextInt(I)I

    move-result p1

    return p1
.end method

.method public nextInt(II)I
    .locals 1

    .line 3
    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lkotlin/random/f;->nextInt(II)I

    move-result p1

    return p1
.end method

.method public nextLong()J
    .locals 2

    .line 1
    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/random/f;->nextLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public nextLong(J)J
    .locals 1

    .line 2
    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lkotlin/random/f;->nextLong(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public nextLong(JJ)J
    .locals 1

    .line 3
    invoke-static {}, Lkotlin/random/f;->access$getDefaultRandom$cp()Lkotlin/random/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lkotlin/random/f;->nextLong(JJ)J

    move-result-wide p1

    return-wide p1
.end method
