.class public Lexternal/org/apache/commons/lang3/builder/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lexternal/org/apache/commons/lang3/builder/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexternal/org/apache/commons/lang3/builder/a<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile d:Lexternal/org/apache/commons/lang3/builder/h;


# instance fields
.field private final a:Ljava/lang/StringBuffer;

.field private final b:Ljava/lang/Object;

.field private final c:Lexternal/org/apache/commons/lang3/builder/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lexternal/org/apache/commons/lang3/builder/h;->DEFAULT_STYLE:Lexternal/org/apache/commons/lang3/builder/h;

    sput-object v0, Lexternal/org/apache/commons/lang3/builder/g;->d:Lexternal/org/apache/commons/lang3/builder/h;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v0}, Lexternal/org/apache/commons/lang3/builder/g;-><init>(Ljava/lang/Object;Lexternal/org/apache/commons/lang3/builder/h;Ljava/lang/StringBuffer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lexternal/org/apache/commons/lang3/builder/h;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lexternal/org/apache/commons/lang3/builder/g;-><init>(Ljava/lang/Object;Lexternal/org/apache/commons/lang3/builder/h;Ljava/lang/StringBuffer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lexternal/org/apache/commons/lang3/builder/h;Ljava/lang/StringBuffer;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    .line 4
    invoke-static {}, Lexternal/org/apache/commons/lang3/builder/g;->Y()Lexternal/org/apache/commons/lang3/builder/h;

    move-result-object p2

    :cond_0
    if-nez p3, :cond_1

    .line 5
    new-instance p3, Ljava/lang/StringBuffer;

    const/16 v0, 0x200

    invoke-direct {p3, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 6
    :cond_1
    iput-object p3, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    .line 7
    iput-object p2, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    .line 8
    iput-object p1, p0, Lexternal/org/apache/commons/lang3/builder/g;->b:Ljava/lang/Object;

    .line 9
    invoke-virtual {p2, p3, p1}, Lexternal/org/apache/commons/lang3/builder/h;->appendStart(Ljava/lang/StringBuffer;Ljava/lang/Object;)V

    return-void
.end method

.method public static Y()Lexternal/org/apache/commons/lang3/builder/h;
    .locals 1

    sget-object v0, Lexternal/org/apache/commons/lang3/builder/g;->d:Lexternal/org/apache/commons/lang3/builder/h;

    return-object v0
.end method

.method public static c0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lexternal/org/apache/commons/lang3/builder/f;->v0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static d0(Ljava/lang/Object;Lexternal/org/apache/commons/lang3/builder/h;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lexternal/org/apache/commons/lang3/builder/f;->w0(Ljava/lang/Object;Lexternal/org/apache/commons/lang3/builder/h;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e0(Ljava/lang/Object;Lexternal/org/apache/commons/lang3/builder/h;Z)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, p1, p2, v0, v1}, Lexternal/org/apache/commons/lang3/builder/f;->z0(Ljava/lang/Object;Lexternal/org/apache/commons/lang3/builder/h;ZZLjava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f0(Ljava/lang/Object;Lexternal/org/apache/commons/lang3/builder/h;ZLjava/lang/Class;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lexternal/org/apache/commons/lang3/builder/h;",
            "Z",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0, p3}, Lexternal/org/apache/commons/lang3/builder/f;->z0(Ljava/lang/Object;Lexternal/org/apache/commons/lang3/builder/h;ZZLjava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g0(Lexternal/org/apache/commons/lang3/builder/h;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sput-object p0, Lexternal/org/apache/commons/lang3/builder/g;->d:Lexternal/org/apache/commons/lang3/builder/h;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v0, "The style must not be null"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
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
.method public A(Ljava/lang/String;[IZ)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, v1, p1, p2, p3}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[ILjava/lang/Boolean;)V

    return-object p0
.end method

.method public B(Ljava/lang/String;[J)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[JLjava/lang/Boolean;)V

    return-object p0
.end method

.method public C(Ljava/lang/String;[JZ)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, v1, p1, p2, p3}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[JLjava/lang/Boolean;)V

    return-object p0
.end method

.method public D(Ljava/lang/String;[Ljava/lang/Object;)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Boolean;)V

    return-object p0
.end method

.method public E(Ljava/lang/String;[Ljava/lang/Object;Z)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, v1, p1, p2, p3}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Boolean;)V

    return-object p0
.end method

.method public F(Ljava/lang/String;[S)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[SLjava/lang/Boolean;)V

    return-object p0
.end method

.method public G(Ljava/lang/String;[SZ)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, v1, p1, p2, p3}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[SLjava/lang/Boolean;)V

    return-object p0
.end method

.method public H(Ljava/lang/String;[Z)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[ZLjava/lang/Boolean;)V

    return-object p0
.end method

.method public I(Ljava/lang/String;[ZZ)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, v1, p1, p2, p3}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[ZLjava/lang/Boolean;)V

    return-object p0
.end method

.method public J(S)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;S)V

    return-object p0
.end method

.method public K(Z)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;Z)V

    return-object p0
.end method

.method public L([B)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[BLjava/lang/Boolean;)V

    return-object p0
.end method

.method public M([C)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[CLjava/lang/Boolean;)V

    return-object p0
.end method

.method public N([D)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[DLjava/lang/Boolean;)V

    return-object p0
.end method

.method public O([F)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[FLjava/lang/Boolean;)V

    return-object p0
.end method

.method public P([I)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[ILjava/lang/Boolean;)V

    return-object p0
.end method

.method public Q([J)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[JLjava/lang/Boolean;)V

    return-object p0
.end method

.method public R([Ljava/lang/Object;)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Boolean;)V

    return-object p0
.end method

.method public S([S)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[SLjava/lang/Boolean;)V

    return-object p0
.end method

.method public T([Z)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[ZLjava/lang/Boolean;)V

    return-object p0
.end method

.method public U(Ljava/lang/Object;)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 1

    invoke-virtual {p0}, Lexternal/org/apache/commons/lang3/builder/g;->a0()Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-static {v0, p1}, Lexternal/org/apache/commons/lang3/f;->k(Ljava/lang/StringBuffer;Ljava/lang/Object;)V

    return-object p0
.end method

.method public V(Ljava/lang/String;)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1, p1}, Lexternal/org/apache/commons/lang3/builder/h;->appendSuper(Ljava/lang/StringBuffer;Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public W(Ljava/lang/String;)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1, p1}, Lexternal/org/apache/commons/lang3/builder/h;->appendToString(Ljava/lang/StringBuffer;Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public X()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lexternal/org/apache/commons/lang3/builder/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public Z()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public a(B)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;B)V

    return-object p0
.end method

.method public a0()Ljava/lang/StringBuffer;
    .locals 1

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    return-object v0
.end method

.method public b(C)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;C)V

    return-object p0
.end method

.method public b0()Lexternal/org/apache/commons/lang3/builder/h;
    .locals 1

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    return-object v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lexternal/org/apache/commons/lang3/builder/g;->X()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(D)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, p2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;D)V

    return-object p0
.end method

.method public d(F)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;F)V

    return-object p0
.end method

.method public e(I)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;I)V

    return-object p0
.end method

.method public f(J)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, p2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;J)V

    return-object p0
.end method

.method public g(Ljava/lang/Object;)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;)V

    return-object p0
.end method

.method public h(Ljava/lang/String;B)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1, p1, p2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;B)V

    return-object p0
.end method

.method public i(Ljava/lang/String;C)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1, p1, p2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;C)V

    return-object p0
.end method

.method public j(Ljava/lang/String;D)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1, p1, p2, p3}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;D)V

    return-object p0
.end method

.method public k(Ljava/lang/String;F)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1, p1, p2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;F)V

    return-object p0
.end method

.method public l(Ljava/lang/String;I)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1, p1, p2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;I)V

    return-object p0
.end method

.method public m(Ljava/lang/String;J)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1, p1, p2, p3}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;J)V

    return-object p0
.end method

.method public n(Ljava/lang/String;Ljava/lang/Object;)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;)V

    return-object p0
.end method

.method public o(Ljava/lang/String;Ljava/lang/Object;Z)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, v1, p1, p2, p3}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;)V

    return-object p0
.end method

.method public p(Ljava/lang/String;S)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1, p1, p2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;S)V

    return-object p0
.end method

.method public q(Ljava/lang/String;Z)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1, p1, p2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;Z)V

    return-object p0
.end method

.method public r(Ljava/lang/String;[B)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[BLjava/lang/Boolean;)V

    return-object p0
.end method

.method public s(Ljava/lang/String;[BZ)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, v1, p1, p2, p3}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[BLjava/lang/Boolean;)V

    return-object p0
.end method

.method public t(Ljava/lang/String;[C)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[CLjava/lang/Boolean;)V

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lexternal/org/apache/commons/lang3/builder/g;->Z()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lexternal/org/apache/commons/lang3/builder/g;->a0()Ljava/lang/StringBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lexternal/org/apache/commons/lang3/builder/g;->b0()Lexternal/org/apache/commons/lang3/builder/h;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lexternal/org/apache/commons/lang3/builder/h;->getNullText()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    .line 24
    .line 25
    invoke-virtual {p0}, Lexternal/org/apache/commons/lang3/builder/g;->a0()Ljava/lang/StringBuffer;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p0}, Lexternal/org/apache/commons/lang3/builder/g;->Z()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v0, v1, v2}, Lexternal/org/apache/commons/lang3/builder/h;->appendEnd(Ljava/lang/StringBuffer;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {p0}, Lexternal/org/apache/commons/lang3/builder/g;->a0()Ljava/lang/StringBuffer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
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

.method public u(Ljava/lang/String;[CZ)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, v1, p1, p2, p3}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[CLjava/lang/Boolean;)V

    return-object p0
.end method

.method public v(Ljava/lang/String;[D)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[DLjava/lang/Boolean;)V

    return-object p0
.end method

.method public w(Ljava/lang/String;[DZ)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, v1, p1, p2, p3}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[DLjava/lang/Boolean;)V

    return-object p0
.end method

.method public x(Ljava/lang/String;[F)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[FLjava/lang/Boolean;)V

    return-object p0
.end method

.method public y(Ljava/lang/String;[FZ)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 2

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, v1, p1, p2, p3}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[FLjava/lang/Boolean;)V

    return-object p0
.end method

.method public z(Ljava/lang/String;[I)Lexternal/org/apache/commons/lang3/builder/g;
    .locals 3

    iget-object v0, p0, Lexternal/org/apache/commons/lang3/builder/g;->c:Lexternal/org/apache/commons/lang3/builder/h;

    iget-object v1, p0, Lexternal/org/apache/commons/lang3/builder/g;->a:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Lexternal/org/apache/commons/lang3/builder/h;->append(Ljava/lang/StringBuffer;Ljava/lang/String;[ILjava/lang/Boolean;)V

    return-object p0
.end method
