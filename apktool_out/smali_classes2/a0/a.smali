.class public La0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:B = 0x1t

.field public static final c:Ljava/lang/String; = "EX"


# instance fields
.field public final a:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La0/a;->a:[B

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La0/a;->a:[B

    invoke-static {v0}, La0/c;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La0/a;->a:[B

    invoke-static {v0}, La0/c;->j([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
