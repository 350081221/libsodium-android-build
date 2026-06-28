.class public Lcom/huawei/secure/android/common/util/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/Character;

.field private c:Ljava/lang/Character;

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/huawei/secure/android/common/util/n;->d:I

    .line 6
    .line 7
    iput v0, p0, Lcom/huawei/secure/android/common/util/n;->e:I

    .line 8
    .line 9
    iput-object p1, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 10
    .line 11
    return-void
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
.end method

.method public static e(Ljava/lang/Character;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    move-result p0

    const/16 v1, 0x30

    if-lt p0, v1, :cond_1

    const/16 v1, 0x39

    if-le p0, v1, :cond_3

    :cond_1
    const/16 v1, 0x61

    if-lt p0, v1, :cond_2

    const/16 v1, 0x66

    if-le p0, v1, :cond_3

    :cond_2
    const/16 v1, 0x41

    if-lt p0, v1, :cond_4

    const/16 v1, 0x46

    if-gt p0, v1, :cond_4

    :cond_3
    const/4 v0, 0x1

    :cond_4
    return v0
.end method

.method public static g(Ljava/lang/Character;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    move-result p0

    const/16 v1, 0x30

    if-lt p0, v1, :cond_1

    const/16 v1, 0x37

    if-gt p0, v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method


# virtual methods
.method public a(Ljava/lang/Character;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/secure/android/common/util/n;->b:Ljava/lang/Character;

    return-void
.end method

.method public b()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->b:Ljava/lang/Character;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    return v2

    .line 13
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v0, p0, Lcom/huawei/secure/android/common/util/n;->d:I

    .line 21
    .line 22
    iget-object v3, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-lt v0, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    return v1
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

.method public c(C)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->b:Ljava/lang/Character;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v0, p1, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return v2

    .line 19
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    return v2

    .line 26
    :cond_2
    iget v0, p0, Lcom/huawei/secure/android/common/util/n;->d:I

    .line 27
    .line 28
    iget-object v3, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-lt v0, v3, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_3
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 38
    .line 39
    iget v3, p0, Lcom/huawei/secure/android/common/util/n;->d:I

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-ne v0, p1, :cond_4

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    move v1, v2

    .line 49
    :goto_0
    return v1
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
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/huawei/secure/android/common/util/n;->d:I

    return v0
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->b:Ljava/lang/Character;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/huawei/secure/android/common/util/n;->c:Ljava/lang/Character;

    .line 4
    .line 5
    iget v0, p0, Lcom/huawei/secure/android/common/util/n;->d:I

    .line 6
    .line 7
    iput v0, p0, Lcom/huawei/secure/android/common/util/n;->e:I

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

.method public h()Ljava/lang/Character;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->b:Ljava/lang/Character;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lcom/huawei/secure/android/common/util/n;->b:Ljava/lang/Character;

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_2
    iget v0, p0, Lcom/huawei/secure/android/common/util/n;->d:I

    .line 22
    .line 23
    iget-object v2, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-lt v0, v2, :cond_3

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_3
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 33
    .line 34
    iget v1, p0, Lcom/huawei/secure/android/common/util/n;->d:I

    .line 35
    .line 36
    add-int/lit8 v2, v1, 0x1

    .line 37
    .line 38
    iput v2, p0, Lcom/huawei/secure/android/common/util/n;->d:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0
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

.method public i()Ljava/lang/Character;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/huawei/secure/android/common/util/n;->h()Ljava/lang/Character;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-static {v0}, Lcom/huawei/secure/android/common/util/n;->e(Ljava/lang/Character;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    return-object v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public j()Ljava/lang/Character;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/huawei/secure/android/common/util/n;->h()Ljava/lang/Character;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-static {v0}, Lcom/huawei/secure/android/common/util/n;->g(Ljava/lang/Character;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    return-object v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public k()Ljava/lang/Character;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->b:Ljava/lang/Character;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_2
    iget v0, p0, Lcom/huawei/secure/android/common/util/n;->d:I

    .line 20
    .line 21
    iget-object v2, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-lt v0, v2, :cond_3

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_3
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 31
    .line 32
    iget v1, p0, Lcom/huawei/secure/android/common/util/n;->d:I

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
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

.method protected l()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, Lcom/huawei/secure/android/common/util/n;->d:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/huawei/secure/android/common/util/n;->b:Ljava/lang/Character;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lcom/huawei/secure/android/common/util/n;->b:Ljava/lang/Character;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_0
    return-object v0
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

.method public m()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/secure/android/common/util/n;->c:Ljava/lang/Character;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/huawei/secure/android/common/util/n;->b:Ljava/lang/Character;

    .line 4
    .line 5
    iget v0, p0, Lcom/huawei/secure/android/common/util/n;->e:I

    .line 6
    .line 7
    iput v0, p0, Lcom/huawei/secure/android/common/util/n;->d:I

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
